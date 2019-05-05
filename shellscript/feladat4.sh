#!/bin/bash

echo "Add meg a nevet:"
read NAME

 if [ $NAME = "Zsolti" ]; then
	echo "Linux Májszter"
 elif [ $NAME = "Tasi" ]; then
	echo "Js Mágus"
 elif [ $NAME = "Feri" ]; then
	echo "Go Pro"
 else
	echo "Hello Diák"
fi
