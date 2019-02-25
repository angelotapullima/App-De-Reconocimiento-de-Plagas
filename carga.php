<?php

$nombre = count(glob('images/{*.jpg,*.gif,*.png}',GLOB_BRACE));

$file_path = "images/";

$file_path = $file_path.basename($_FILES['imagen']['name']);
if(move_uploaded_file($_FILES['imagen']['tmp_name'], $file_path)) {
	$ruta="images/".$name;
    echo $ruta;
} else{
    echo "fail";
}



/**
	
	$imagen = $_POST["imagen"];

	
	$nombre = count(glob('images/{*.jpg,*.gif,*.png}',GLOB_BRACE));

	$path="images/$nombre.jpg";

	$url = "http://35.196.239.95/carga/$path";

	//move_uploaded_file($imagen, $path)
	file_put_contents($path,$imagen);
	$bytesArchivo=file_get_contents($path);

	

	echo "registra";

?>**/
?>