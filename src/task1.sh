#!/bin/sh
until [ "$PWD" = "/" ]; do
  echo "$PWD"
  ls && cd .. && ls
done
if [ ! -d "$PWD"/this/is/my/linux/exam ]
then
:
mkdir -p "$PWD"this/is/my/linux/exam
fi
touch ~"$PWD"this/is/my/linux/exam/my_file.py
mv task1.sh ~"$PWD"
# not knowing the exact ASCII  color codes, I found an example of modifying the print command in this manner at https://stackoverflow.com/questions/5947742/how-to-change-the-output-color-of-echo-in-linux
RED='\033[0;31m'
NC='\033[0m' # No Color
echo -e "${NC}This bash script has finished${RED}!\n"
