<!DOCTYPE html>
<html lang="Ru">
<head><title>BUYSELL</title></head>
<body>
<h3>Название товара: ${product.title}</h3>
<h3>Описание товара: ${product.description}</h3>
<h3>Цена товара: ${product.price}</h3>
<h3>Город товара: ${product.city}</h3>
<h3>Имя товара: ${product.author}</h3>
<br>
<hr>
<br>
<h3>Удалить товар</h3>
<form action="/product/delete/${product.id}" method="post">
    <input type="submit" value="Удалить">
</form>
</body>
</html>