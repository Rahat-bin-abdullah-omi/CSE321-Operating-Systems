#!/bin/bash
div() {
	
	for((c=1;c<=100;c++))
		do
			if [[ $c%5==0 ]]; then
				echo $c
			fi
		done
	
}
div

