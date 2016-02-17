#!/bin/bash
# pmc
# 2016-02-16
# git add, commit push script
if [[ $# -ne 1 ]] ; then
    echo Usage $(basename $0) "commit message"
    exit 1
fi
git add --all .
git status
read -p "continue y/n" cont
if [[ $cont == "y" ]] ; then
    git commit -m $1
    git push
fi
