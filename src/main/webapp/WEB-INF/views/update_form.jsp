<%--
  Created by IntelliJ IDEA.
  User: dayyan
  Date: 28/04/2022
  Time: 18:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!doctype html>
<html lang="en">
<head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <!-- Bootstrap CSS -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

  <title>Edit Product Details</title>
</head>
<body>

<div class="container mt-3">
  <div class="row">
    <div class="col-md-6 offset-md-3">
      <h1 class="text-center mb-3">Change Product Details</h1>
      <form action="${pageContext.request.contextPath}/product-update" method="post">
        <input type="hidden" value="${product.id}" name="id">
        <div class="form-group mb-3">
          <label for="name" class="form-label">Product Name</label>
          <input type="text" class="form-control" id="name"
                 name="name" aria-describedby="emailHelp"
                 placeholder="Enter Product Name" value="${product.name}">
        </div>

        <div class="form-group mb-3">
          <label for="description" class="form-label">Product Description</label>
          <textarea class="form-control" id="description"
                    name="description" aria-describedby="emailHelp" rows="5"
                    placeholder="Enter Product Description">${product.description}</textarea>
        </div>

        <div class="form-group mb-3">
          <label for="price" class="form-label">Product Price</label>
          <input type="text" class="form-control" id="price"
                 name="price" aria-describedby="emailHelp"
                 placeholder="Enter Product Price" value="${product.price}">
        </div>

        <div class="container text-center">
          <a href="${pageContext.request.contextPath}/" class="btn btn-outline-danger">Back</a>
          <button type="submit" class="btn btn-warning">Update</button>
        </div>
      </form>
    </div>
  </div>
</div>


<!-- Option 1: Bootstrap Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>
