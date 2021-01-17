#!/bin/bash
echo "What do you want"
read Music
read display
case "display" in
	short) ls $Music;;
long) ls -l $Music;;
hidden) ls -a $Music;;
*) echo "Not valid"
esac
