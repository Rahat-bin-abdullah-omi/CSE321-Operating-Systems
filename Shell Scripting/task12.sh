#echo "Input number"
#read no
#echo "Input power"
#read power



myfunc()
{
local no=3
local power=2  


counter=0
ans=1
while [ $power -ne $counter ]
do
        ans=`expr $ans \* $no`
        counter=`expr $counter + 1`
done

echo "$no power of $p is $ans"
}

myfunc


