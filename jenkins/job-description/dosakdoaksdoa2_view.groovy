 
listView('dosakdoaksdoa2 Jobs') {
    description('dosakdoaksdoa2 Jobs')
    jobs {
        regex('dosakdoaksdoa2_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
