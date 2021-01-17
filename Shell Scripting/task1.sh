#!/bin/bash
rev=0
while [[ $1!=0 ]]; do
	temp=$(($1%10))
	rev=$(($rev*10+$temp))
	$1=$(($1/10))
done
echo "$rev"