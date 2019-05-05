#!/bin/bash
java DbGenerator >> /tmp/sql_inserts.sql
sudo -i -u postgres
psql -U postgres -d flowhub -c /temp/sql_inserts
