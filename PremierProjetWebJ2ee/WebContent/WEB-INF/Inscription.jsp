<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta charset="utf-8"/>
        <title> Formulaire Inscription</title>
        <link href="style.css" rel="stylesheet"/>
    </head>
    <body>
		<header></header>
		<nav></nav>
		<section>
			<form method="post">
		       <label for="pseudo">Votre pseudo :</label>
		       <input type="text" name="pseudo" id="pseudo" />
		       
		       <label for="password">Votre mot de passe :</label>
		       <input type="password" name="password" id="password" />
		       
		       <label for="confirmation">Votre mot de passe :</label>
		       <input type="password" name="confirmation" id="confirmation" />
		       
		       <input type="submit" value="Inscrire"/>
			</form>
			
            <article></article>
        </section>
		<footer></footer>
    </body>
 </html>