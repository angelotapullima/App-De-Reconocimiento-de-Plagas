<?php


$rutaFoto="images/0.jpg";
//$salida = 'python3 identificar_hoja.py "'.$rutaFoto.'"';
$salida = shell_exec('python3 identificar_hoja.py "'.$rutaFoto.'"');
$salida=json_encode($salida);
echo $salida;

?>