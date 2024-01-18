<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class UserController extends Controller
{
    public function users()
    {
        return view('users.utilizador');
    }

    public function allUsers()
    {

        $hello = 'Finalmente código';
        $helloAgain = 'Mais um Hello';
        $daysOfWeek = $this->getWeekDays();
        $info = $this->courseInfo();
        $users = $this->getContacts();

        // dd($info);
        //var_dump();


        return view('users.all_users', compact(
            'hello',
            'helloAgain',
            'daysOfWeek',
            'info',
            'users'
        ));
    }

    private function getWeekDays()
    {
        $daysOfWeek = ['Segunda', 'Terça', 'Quarta', 'Quinta'];
        return $daysOfWeek;
    }


    private function courseInfo(){
        $courseInfo = ['name' => 'Software Developer', 'year' => 2024, 'modules' => ['PHP', 'WebServices', 'Java'],['Teste', 10, 'Rita', 'Severa']];
        return $courseInfo;
    }

    private function getContacts(){
        $users = [
            ['id'=>1, 'name'=>'Sara', 'Phone'=>'91222222', 'Email'=>'sara@gmail.com'],
            ['id'=>2, 'name'=>'Renato', 'Phone'=>'91222222', 'Email'=>'renato@gmail.com'],
            ['id'=>3, 'name'=>'Rita', 'Phone'=>'91222222', 'Email'=>'rita@gmail.com'],
            ['id'=>4, 'name'=>'Francisco', 'Phone'=>'91222222', 'Email'=>'francisco@gmail.com']
        ];

        return $users;
    }


}
