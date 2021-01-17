#!/bin/bash
echo "Starting range"
read m
echo "Ending range"
read n
prime=0
for((c=m;c<=n;c++))
do
	factor=0
	for((i=1;i<=c;i++))
	do
		if [ c%i==0 ]; then
			factor++
		fi
	done
		if [ factor==2 ]; then
			prime++
		fi
done
echo $prime
