#!/bin/bash
echo "What is the file name?"
read name
if [ -f $name ]; then
	if [ -w $name ]; then
		echo "It is a file and it is writable"
	fi
else
	echo "It is not writable"
fi