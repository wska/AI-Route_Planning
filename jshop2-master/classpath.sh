CLASSPATH=.
prepend_path()
{
  if ! eval test -z "\"\${$1##*:$2:*}\"" -o -z "\"\${$1%%*:$2}\"" -o -z "\"\${$1##$2:*}\"" -o -z "\"\${$1##$2}\"" ; then
    eval "$1=$2:\$$1"
  fi
}

prepend_path CLASSPATH /home/william/Documents/Courses/DD2380/a3/jshop2-master/antlr.jar
prepend_path CLASSPATH /home/william/Documents/Courses/DD2380/a3/jshop2-master/bin.build/JSHOP2.jar

echo $CLASSPATH
export "CLASSPATH="CLASSPATH
