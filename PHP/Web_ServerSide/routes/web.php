<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\IndexController;
use App\Http\Controllers\UserController;


/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider and all of them will
| be assigned to the "web" middleware group. Make something great!
|
*/

Route::get('/', function () {
    return view('welcome');
})->name('bemvindos');


Route::get('/users/add', [UserController::class, 'users'])->name('users.add');



Route::get('/users/all', [UserController::class, 'allUsers'])->name('users.all');


Route::get('/home', [IndexController::class, 'index']) ->name('home.index');


Route::get('/hello', function () {
    return '<h1>Hello turma de SoftDev</h1>';
});

Route::get('/hello/{nome}', function ($nome) {
    return '<h1>Hello turma de SoftDev</h1>'.$nome;
});

Route::fallback(function(){
    return view('main.fallback');
});

// rotas dos Controllers


