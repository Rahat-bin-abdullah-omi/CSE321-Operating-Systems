#!/bin/bash
fib(){
	n1=0 
	n2=1 
	echo "$n1 $n2"
	for((c=2;c<=$1;c++))
	do
		n3=((n1+n2))
		echo "$n3"
		n1=$n2
		n2=$n3

}
fib

