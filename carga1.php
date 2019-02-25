<?php



$imagen = $_POST["imagen"];

$nombre = count(glob('images/{*.jpg,*.gif,*.png}',GLOB_BRACE));


$path="images/$nombre.jpg";
//$rutaFoto="$nombre.jpg";

//$url = "http://www.conecit.pe/$path";

file_put_contents($path,base64_decode($imagen));
$bytesArchivo=file_get_contents($path);

//echo $path;

$salida = shell_exec('python3 identificar_hoja.py '.$path);
echo $salida;



?>