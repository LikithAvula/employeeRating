
#!/usr/bin/env bash


cd ../../../../../../../../../
cd /home/ec2-user/employee_rating_codeDeploy/target
nohup java -jar EmployeesRating-0.0.1-SNAPSHOT.jar >/dev/null 2>&1 &
echo $! > /home/ec2-user/employee_rating_codeDeploy/pid/pid.file