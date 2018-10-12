
CLASSPATH=.
prepend_path()
{
  if ! eval test -z "\"\${$1##*:$2:*}\"" -o -z "\"\${$1%%*:$2}\"" -o -z "\"\${$1##$2:*}\"" -o -z "\"\${$1##$2}\"" ; then
    eval "$1=$2:\$$1"
  fi
}

prepend_path CLASSPATH 'pdw'/jshop2-master/antlr.jar
prepend_path CLASSPATH 'pwd'/jshop2-master/bin.build/JSHOP2.jar

echo $CLASSPATH
export "CLASSPATH="CLASSPATH
