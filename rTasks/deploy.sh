TARGET=/Users/leo/projects/railssummit09/rTasks/target/rTasks.war
DEPLOY_DIR=/Users/leo/development/jetty-6.1.20/webapps/
cd $DEPLOY_DIR
cp $TARGET .
rm -rf rTasks
mkdir rTasks
cd rTasks
unzip ../rTasks.war
rm ../rTasks.war