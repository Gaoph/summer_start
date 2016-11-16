<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="container">
    <div class="row">
        <div class="col-md-5"></div>
        <div class="col-md-4">
            <h3>功能列表</h3>
        </div>
        <div class="col-md-4"></div>
    </div>
    <div class="row">
        <table class="table table-bordered">
            <thead>
            <tr class="success">
                <th>模块名称</th>
                <th>链接</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>查看图片</td>
                <td><a href="/picture/get_picture_list">图片列表</a></td>
            </tr>
            <tr>
                <td>查看用户</td>
                <td><a href="/user/get_users">用户列表</a></td>
            </tr>
            <tr>
                <td>图片上传</td>
                <td><a href="/picture/to_upload">上传页面</a></td>
            </tr>

            </tbody>
        </table>
    </div>
</div>