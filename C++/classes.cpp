//basics CPP class commented from MAX for FRAUASINFO DISCORD/
#include <iostream> //required to use input output
#include <string> //to my knowledge not required
using namespace std; //required to NOT PUT std:: before a lot of statements

string inputs; // not the intended way to read in the string form user if you know how to do properly please post your version

class Computer{ //declares a class called Computer
        private: //space to declare private variables
            string OS; //declares a private string called os (the os name would go here)
            bool state; //declares a private bool called state (the power satate on or off goes here)
        public: //space to place public method or variables
            void setOS(string s){ //setter method for private variable OS the string s is read in by the function #NOTE# the name of the method can be anything set is not required #NOTE#
                OS=s; // here the private variable is set to the read in value s, #note# in this part you can access private variables #note#
            }; // end of method
            void setState(bool b){ //setter method for private variable state the bool b is read in by the function #NOTE# the name of the method can be anything set is not required #NOTE#
                state = b; //  here the private variable is set to the read in value b, #note# in this part you can access private variables #note#
            }; // end of method
    
            string getOS(){ // getter method for private variable OS, you can use this to read out a saved private variable #NOTE# the name of the method can be anything get is not required #NOTE#
                return OS; // retrurns the value of OS as a read only
            }; // end of method
            bool getState(){ // getter method for private variable state, you can use this to read out a saved private variable #NOTE# the name of the method can be anything get is not required #NOTE#
                return state; // retrurns the value of state as a read only
            }; // end of method
    };// end of class 1

class Server : public Computer { //this is a child class inheriting the variables and functions from its parent class Computer
    private:
        string ipAdress; //declares a private string called os (the os name would go here)
    public:
        void setIP(string ip){ //setter method for private variable ipAdress the string ip is read in by the function #NOTE# the name of the method can be anything set is not required #NOTE#
        ipAdress = ip; // here the private variable is set to the read in value ip, #note# in this part you can access private variables #note#
        }; // end of method
        string getIP(){ // getter method for private variable ipAdress, you can use this to read out a saved private variable #NOTE# the name of the method can be anything get is not required #NOTE#
        return ipAdress; // retrurns the value of ipAdress as a read only
        }; // end of method
}; // end of method

int main(){
    
    Computer c1; //create new object of class Computer (static)
    cout << "Which OS is runnig on PC1 ?(please do not use spaces)" << endl; //hint for user
    cin >> inputs; //readin the variable inputs
    c1.setOS(inputs); //sets objects variable OS to the contents of inputs (just read in)
    cout << "Gotcha OS for PC1 is :" << c1.getOS() << endl; // to output the content of OS use the above programmed getOS() function like a variable

    Computer *c2; //create new class pointer (for dynamic)
    c2 = new Computer; //create new object of class Computer (dynamic)
    c2 -> setOS("Linux"); //sets objects variable OS to the contents of parentesis (you could use the same solution as seen above if you'd whish user interaction)
    cout << "computer 2 is allready set to run" << c2 -> getOS() << endl; //to output the content of OS use the above programmed getOS() function with a pointer from the object
    delete c2; //destorys the object c2 (required if the object is no longer in use... does not get destoried by runtime)

    Server s1; //creates new object of class Server (static)      
    cout << "Which OS is runnig on Server 1 ?(please do not use spaces)" << endl; //hint for user
    cin >> inputs; // read in the variable inputs
    s1.setOS(inputs); //sets objects variable OS to the contents of inputs (just read in)
    
    cout << "Ok than whats the IP of the Server 1?(please do not use spaces))" << endl; //hint for user
    cin >> inputs; // read in the variable inputs
    s1.setIP(inputs); //sets objects variable OS to the contents of inputs (just read in)

    cout << "So that's OS and IP for Sever 1" << endl; //hint for user
    cout << s1.getOS() << endl; // to output the content of OS use the above programmed getOS() function like a variable
    cout << s1.getIP() << endl; // to output the content of ipAdresse use the above programmed getIP() function like a variable
    return 0; //exit code 0 when run succesfully
} // end of method