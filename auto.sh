echo 'start'

filePath=`git status -u -s | head -n 1`

echo ${filePath:2}

commitMag=`cat ${filePath:2} | head -1`

echo $commitMag

problemId=`echo ${commitMag:2} | cut -d ' ' -f1`
problemKind=`echo ${commitMag:2} | cut -d ' ' -f2`
problemURL=`echo 'https://www.acmicpc.net/problem/'$problemId`
problemCommit=`echo -e $problemKind'\n'$problemURL`

echo $problemId
echo $problemKind
echo $problemURL
echo $problemCommit

git add ${filePath:2}
git commit -m "$problemId" -m "${problemCommit:3}"
git push

echo "end"