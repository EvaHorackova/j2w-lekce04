[#ftl]

<!DOCTYPE html>
<html lang="cs">
<head>
    [#include '/_common/head.ftlh']
</head>
<body>

<div class="container">
    [#include '/_common/header.ftlh']

[#list lekce]
    <table class="table">
        <thead>
        <tr>
            <th scope="col"></th>
            <th scope="col">Název lekce</th>
            <th scope="col">Datum</th>
            <th scope="col">Čas</th>
            <th scope="col">Místo</th>
        </tr>
        </thead>
        <tbody>
        [#items as lekce]
            <tr>
                <td>${lekce?counter}.</td>
                <td>${lekce.nazev}</td>
                <td>${lekce.datum}</td>
                <td>${lekce.cas}</td>
                <td>${lekce.misto}</td>
            </tr>
        [/#items]
        </tbody>
    </table>
        [#else]
            <div>
                <em>Seznam lekcí je prázdný.</em>
            </div>
    [/#list]
</div>
</body>
</html>
