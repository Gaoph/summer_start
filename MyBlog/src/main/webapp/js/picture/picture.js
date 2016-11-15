/**
 * 上传图片
 */
var queueArray = [];
function uploadPicture() {
    $("#file_upload").uploadify({
        multi: true,
        formData: {
            'type': 'picture'
        },//传输数据JSON格式
        swf: "/myblog/uploadify/uploadify.swf",
        auto: true,
        uploader: "/upload",
        buttonText: "上传图片",
        fileObjName: 'Filedata',
        fileSizeLimit: '50MB',
        fileTypeExts: '*.png;*.jpg',
        successTimeout: 99999,
        height: 28,
        width: 90,
        queueID: 'queue', //默认队列ID
        simUploadLimit: 5,
        onInit: function () {

        },
        onUploadStart: function (file) {

        },
        onUploadSuccess: function (file, data, response) {
            queueArray.push(JSON.parse(data));
        },
        //上传完成
        onQueueComplete: function (queueData) {  //所有队列完成后事件
            var fileArray = [];
            for (var i = 0; i < queueArray.length; i++) {
                fileArray.push(creatObject(queueArray[i].obj[0].filePath, queueArray[i].obj[0].fileName))
            }
            $.ajax({
                type: "post",
                async: true,
                url: "/picture/upload_picture",
                data: {'jsonData': JSON.stringify(fileArray)},
                success: function (data) {
                    queueArray.length = 0;
                    alert("上传完毕！");
                },
                error: function () {

                }
            });


            function creatObject(filePath, fileName) {
                var obj = {};
                obj.picName = fileName;
                obj.picPath = filePath;
                return obj;
            }
        }
    });
}
$(function () {
    uploadPicture();
});