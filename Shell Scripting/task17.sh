#!/bin/bash
read n
for((row=1;row<=n;row++))
do
	for((sp=1;sp<=(m-row);sp++))
	do
		echo " "
	done
	for((col=(n+1-row);col<=n;col++))
	do
		if [ row==n||col==1||col==n||col==n-$row+1 ]; then
			echo "*"
		else
			echo " "
		fi
	done
	echo "-n"

	









