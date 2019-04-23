find . -name .DS_Store -type f -delete
find . -name .project -type f -delete
find . -name .classpath -type f -delete
rm -rf `find . -name .settings -type d`
rm -rf `find . -name target -type d`

find . -type f -exec sed -i 's/<string1>/<string2>/g' {} +

zip -r code.zip code