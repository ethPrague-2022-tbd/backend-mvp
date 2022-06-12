# backend-mvp

Uncomplete basae backend for the hackathon.
Feel free to skip it and check the FE repository https://github.com/ethPrague-2022-tbd/frontend-mvp

`docker build -f Dockerfile -t 'backend' ./`

`docker run -p 4567:4567 backend java -jar app.jar`

request example:
`curl localhost:4567/users/current`
