# backend-mvp

`docker build -f Dockerfile -t 'backend' ./`

`docker run -p 4567:4567 backend java -jar app.jar`

request example:
`curl localhost:4567/users/current`
