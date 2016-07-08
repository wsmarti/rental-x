# rentalx

- Inicializar o repositório local
git init

- Adicione o repositório remoto 
git remote add origin [url do github]

- Comitando localmente
git add --all
git commit -m "comment"

- Add proxy no git
git config --add https.proxy https://[user:senha]@urlempresa:porta
git config --add http.proxy http://[user:senha]@urlempresa:porta

- Commitar no github
git push origin master

- Update do repositório local com remoto
 git pull origin master
