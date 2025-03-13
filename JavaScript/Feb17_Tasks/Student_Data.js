let Student_Data = {
    id: prompt("Enter the id"),
    name: prompt("Enter the name: "),
    department: prompt("Enter the department: "),
    college: prompt("Enter the college"),
    email: prompt("Enter the email: "),

    displayDetails: function() {
        console.log(`ID: ${this.id}`);
        console.log(`Name: ${this.name}`);
        console.log(`Department: ${this.department}`);
        console.log(`College: ${this.college}`);
        console.log(`Email: ${this.email}`);
    },

    displayBasicInfo: function() {
        console.log(`ID: ${this.id}`);
        console.log(`Name: ${this.name}`);
        console.log(`Email: ${this.email}`);
    }
};

console.log("Student Details:");
Student_Data.displayDetails();

console.log("\nBasic Information:");
Student_Data.displayBasicInfo();


Student_Data.address = {
    doorNo: prompt("Enter the doorno: "),
    street: prompt("Enter the street name: "),
    area: prompt("Enter the area: "),
    pincode: prompt("Enter the pincode")
};

Student_Data.displayDetailsWithAddress = function() {
    console.log(`ID: ${this.id}`);
    console.log(`Name: ${this.name}`);
    console.log(`Department: ${this.department}`);
    console.log(`College: ${this.college}`);
    console.log(`Address: ${this.address.doorNo}, ${this.address.street}, ${this.address.area}, ${this.address.pincode}`);
};

console.log("\nStudent Details with Address:");
Student_Data.displayDetailsWithAddress();



/*delete student.email;

delete student.displayBasicInfo;

console.log("\nAfter Deleting Email and Basic Info Function:");
console.log(student); */
