
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==" crossorigin="anonymous" referrerpolicy="no-referrer" />

    <title>MY HOME</title>
</head>
<body>

    <div class="container mt-3">
        <div class="row">
            <div class="col-md-10">
                <h1 class="text-center mb-3 offset-md-1">Welcome to Product App</h1>

                <table class="table caption-top offset-md-1">
                    <caption>List of users</caption>
                    <thead>
                    <tr>
                        <th scope="col">S.No.</th>
                        <th scope="col">Product Name</th>
                        <th scope="col">Description</th>
                        <th scope="col">Price</th>
                        <th scope="col">Action</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="p" items="${products}" >
                        <tr>
                            <th scope="row">${p.id}</th>
                            <td>${p.name}</td>
                            <td>${p.description}</td>
                            <td style="font-weight: bold">&#36; ${p.price}</td>
                            <td>
                                <a href="delete/${p.id}"><i class="fa-solid fa-trash-can"></i></a>
                                <a href="update/${p.id}"><i class="fa-solid fa-pen-nib offset-md-3"></i></a>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>

                </table>

                <div class="container text-center">
                    <a href="add-product" class="btn btn-outline-success offset-md-1">Add Product</a>
                </div>
            </div>
        </div>
    </div>

<!-- Option 1: Bootstrap Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>

