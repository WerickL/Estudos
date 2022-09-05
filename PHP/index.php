
<h1>Essa página está sendo escrita em ambiente php</h1>
<?php 
$nome = "werick";
$nome = $_GET['nome'];

echo "Bem vindo  $nome, esse é um exemplo de código PHP.";
?>
<form action="index.php">
    <input type="text" name="nome">
    <input type="submit">
</form>
