# TASK 1

mkdir System_src
cd ~/System_src
cat > home_animals
cat > pack_animals
cat home_animals pack_animals > animals
cat animals
mv animals mans_friends
ls -ali

## TASK 2

cd ..
mkdir System_src
cd ~/System_src
mv mans_friends ~/System_src
cd ~/System_src
ls -ali

## TASK 3

sudo wget <https://dev.mysql.com/get/mysql-apt-config_0.8.23-1_all.deb>

sudo dpkg -i mysql-apt-config_0.8.23-1_all.deb
sudo apt-get update
sudo apt-get install mysql-server

## TASK 4

sudo wget <https://download.docker.com/linux/ubuntu/dists/jammy/pool/stable/amd64/docker-ce-cli_20.10.13~3-0~ubuntu-jammy_amd64.deb>

sudo dpkg -i docker-ce-cli_20.10.133-0ubuntu-jammy_amd64.deb
sudo dpkg -r docker-ce-cli
