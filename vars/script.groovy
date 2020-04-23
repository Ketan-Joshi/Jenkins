def loadColors(){
    RED='\033[0;31m'
    GREEN='\033[0;32'
    NC='\033[0m'

def info(message){
    loadColors()
    sh """set +x;echo -e "${GREEN}[WARN] - ${message} ${NC}" """
}

def warn(message){
    loadColors()
    sh """set +x;echo -e "${RED}[WARN] - ${message} ${NC}" """
}

def info(message){
    loadColors()
    sh """set +x;echo -e "${GREEN}[GIT COMMIT ID] - ${message} ${NC}" """
}

