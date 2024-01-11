<?php

use Illuminate\Support\Facades\Route;

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


Route::get('/users/add', function () {
    return view('users.utilizador');
})->name('users.add');



Route::get('/home', function () {
    return view('main.home');
});


Route::get('/hello', function () {
    return '<h1>Hello turma de SoftDev</h1>';
});

Route::get('/hello/{nome}', function ($nome) {
    return '<h1>Hello turma de SoftDev</h1>'.$nome;
});

Route::fallback(function(){
    return view('main.fallback');
});

