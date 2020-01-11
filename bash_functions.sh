#!/bin/bash
echo
echo Welcome Shawn! What are we making today?
echo

function run {
    filename="${1%.*}"
    javac $filename.java
    if [[ $? == 0 ]]; then
       echo Compiled $filename successfully...
       echo Now running...
       echo
       java $filename
    else
       echo Really... You are pretty bad at this
       echo
    fi
}
function template {
    folderName="${1%.*}"
    mkdir /home/ubuntu/workspace/$folderName
    if [[ $? == 0 ]]; then
        cp /home/ubuntu/workspace/100_Template/Lab.java /home/ubuntu/workspace/$folderName
        echo Success! Created your template in: $folderName
        echo
        cd /home/ubuntu/workspace/$folderName
    else
        echo Failed to create directory
        echo
    fi
}
function newClass {
    newClass="${1%.*}"
    loc="$PWD"
    touch $newClass.java
    echo class $newClass{ >> $loc/$newClass.java
    echo "  "$newClass"(){" >> $loc/$newClass.java
    echo "  "} >> $loc/$newClass.java
    echo } >> $loc/$newClass.java
    echo Made new Object: $newClass
}
function backup {
    DATE=`date +%Y-%m-%d`
    backup='_Backup'
    echo Working on backup...
    mkdir /home/ubuntu/backup/$DATE$backup
    cp -r /home/ubuntu/workspace/* /home/ubuntu/backup/$DATE$backup
    echo /home/ubuntu/backup/$DATE$backup >> /home/ubuntu/workspace/backuplog
    echo
    echo $DATE$backup Finished!
}
#source /home/ubuntu/workspace/bash_functions.sh

function lookLikeImDoingSomethingLily {
    while [ true ]
    do
    java snake
    sleep 5
    done
}