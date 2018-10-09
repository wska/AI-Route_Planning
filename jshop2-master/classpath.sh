
CLASSPATH=.
prepend_path()
{
  if ! eval test -z "\"\${$1##*:$2:*}\"" -o -z "\"\${$1%%*:$2}\"" -o -z "\"\${$1##$2:*}\"" -o -z "\"\${$1##$2}\"" ; then
    eval "$1=$2:\$$1"
  fi
}

prepend_path CLASSPATH /home/bts/Downloads/jshop2-master/bin/antlr.jar
prepend_path CLASSPATH /home/bts/Downloads/jshop2-master/bin/JSHOP2.jar

echo $CLASSPATH
export CLASSPATH
