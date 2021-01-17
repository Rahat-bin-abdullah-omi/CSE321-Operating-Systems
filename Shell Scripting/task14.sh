echo "Enter two numbers with space in between :"
read a b


if [ $a -gt $b ]
then
num=$a
den=$b
else
num=$b
den=$a
fi
r=`expr $num % $den`

while [ $r -ne 0 ]
do
num=$den
den=$r
r=`expr $num % $den`
done

gcd=$den
lcm=`expr $a \* $b / $gcd`

echo " The LCM of $a and $b is : $lcm"
#echo " The GCD of $a and $b is : $gcd"
