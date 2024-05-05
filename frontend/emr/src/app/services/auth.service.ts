import { Injectable } from "@angular/core";

@Injectable()
export class AuthService{
    login(user:string,password:string):boolean{
        if(user=='admin' && password=='admin'){
            console.log("Setting local storage");
            localStorage.setItem("username",user);
            return true;
        }else{
            console.log("Returnin false");
            return false;
        }
    }

    logout():void{
        localStorage.removeItem("username");
    }

    getUser():any{
        return localStorage.getItem("username");
    }

    isLoggedIn():boolean{
        return this.getUser()!=null;
    }
}