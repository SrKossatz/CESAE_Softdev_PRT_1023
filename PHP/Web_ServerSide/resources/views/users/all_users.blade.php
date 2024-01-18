@extends('layouts.femaster')
@section('content')
    <h3>Olá, sou users</h3>

    <p>{{ $hello }}</p>
    <p>{{ $helloAgain }}</p>
    <p>{{ $daysOfWeek[2] }}</p>
    <p>{{ $info['name'] }}</p>
    <p>{{ $info[0][2] }}</p>


    <table class="table">
        <thead>
          <tr>
            <th scope="col">ID</th>
            <th scope="col">Name</th>
            <th scope="col">Phone</th>
            <th scope="col">Email</th>
          </tr>
        </thead>

        <tbody>
            @foreach ($users as $user)

            {{$user['name']}} - {{$user['Email']}};

            @endforeach
          <tr>
            <th>{{$user['id']}}</th>
            <td>Mark</td>
            <td>Otto</td>
            <td>@mdo</td>
          </tr>
          <tr>
            <th scope="row">2</th>
            <td>Jacob</td>
            <td>Thornton</td>
            <td>@fat</td>
          </tr>
          <tr>
            <th scope="row">3</th>
            <td colspan="2">Larry the Bird</td>
            <td>@twitter</td>
          </tr>
        </tbody>
      </table>


@endsection
