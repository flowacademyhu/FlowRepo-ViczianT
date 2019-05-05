#!/bin/bash

VAR1=$1
VAR2=$2
#Itt kellene lennie az első értékösszhasolnlításnak
if [ $# -gt 2 ]; then
	echo "Kettőnél több input"
fi
if [ $((VAR1 % 2)) -ne 0 ] || [ $((VAR2 % 2)) -ne 0 ]; then
	echo "Nem páros szám legalább az egyik"
fi

if [ $VAR1 -lt 1 ] || [ $VAR2 -lt 1 ]; then
	echo "Legalább az egyik 0 v kisebb"
else
 if [ $VAR1 -gt $VAR2 ]; then
	echo $VAR1
 else
	echo $VAR2
 fi
fi
echo $VAR1 $VAR2
