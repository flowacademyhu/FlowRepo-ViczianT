#!/bin/bash

VAR=1
for i in $@
do
	echo $VAR $i
	(( VAR= $VAR + 1 ))
done



