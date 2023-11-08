let array = [2,1,5,4,3]; 

function Sort(array) { 
	array.sort((a,b)=>b-a); 
	return array; 
} 

console.log(Sort(array)); 
