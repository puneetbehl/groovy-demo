
new File('/home/puneet/Desktop/myFile.txt') // Will not create file
new File('/home/puneet/Desktop/myFile.txt').text  = "My First file" // Will create file

/*
* Print each file name - implicit parameter
*/
new File('/home/puneet/Desktop').eachFile {
	println it.name
}

/*
* Print each file name - parameter
*/
new File('/home/puneet/Desktop').eachFile { file-> 	println file.path }

/*
* Print content of each file content, line by line
*/

new File('/home/puneet/Desktop').eachFile {file->
	println "$file.name contents..." 
	file.eachLine {line-> println line}
}

/* 
* Return all lines in an array 
*/
new File('/home/puneet/Desktop/myFile.txt').readLines()
