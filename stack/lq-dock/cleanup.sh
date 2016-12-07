#!/bin/sh
set +e
docker rm $(docker ps -q -f status=exited)
docker rmi $(docker images -f 'dangling=true' -q)
docker volume rm $(docker volume ls -f dangling=true -q)
exit 0
