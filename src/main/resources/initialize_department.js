print("useObj inside initialize_department is:: "+JSON.stringify(userObj));
print("useObj2 inside initialize_department is:: "+JSON.stringify(userObj2));
print("useObj3 inside initialize_department is:: "+JSON.stringify(userObj3));
print("useObj4 inside initialize_department is:: "+JSON.stringify(userObj4));
print("useObj4 inside initialize_department using execution.getVariable is:: "+JSON.stringify(execution.getVariable("userObj4")));

var obj={
	id:1,
	name:'IT'
}

print("Department Object :: "+JSON.stringify(obj));