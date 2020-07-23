bash ./scripts/env.sh

cd back_end

./gradlew clean
./gradlew jar

setsid java -jar build/libs/project.jar

cd ../front_end

npm run start