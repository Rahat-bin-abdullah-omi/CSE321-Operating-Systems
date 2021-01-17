#!/bin/bash
echo "Give me a name"
read name
if [ -d name ]; then
	echo "it is a directory"
elif [ -f name ]; then
	echo "It is a file"
fi