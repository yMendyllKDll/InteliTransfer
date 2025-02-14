INSERT INTO transferencia (id,conta_origem, conta_destino, valor, valor_taxa, taxa, dt_agendamento, dt_transferencia)
VALUES (NEXTVAL('sqteste'),'1234567', '9876543', 62.00, 12, 0, '2025-02-12 10:00:00', '2025-03-13 10:30:00');
INSERT INTO transferencia (id,conta_origem, conta_destino, valor, valor_taxa, taxa, dt_agendamento, dt_transferencia)
VALUES (NEXTVAL('sqteste'),'9876543', '1234567', 53.00, 3, 0.025, '2025-02-11 11:00:00', '2025-04-13 11:30:00');
INSERT INTO transferencia (id,conta_origem, conta_destino, valor, valor_taxa, taxa, dt_agendamento, dt_transferencia)
VALUES (NEXTVAL('sqteste'),'1111111', '2222222', 750.00, 100.00, 10, '2024-02-10 12:00:00', '2025-05-13 12:30:00');

INSERT INTO taxaTransf (diasDe, diasAte, valor, taxa) VALUES (0, 0, 3.00, 0.025);
INSERT INTO taxaTransf (diasDe, diasAte, valor, taxa) VALUES (1, 10, 12.00, 0.0);
INSERT INTO taxaTransf (diasDe, diasAte, valor, taxa) VALUES (11, 20, 0.00, 0.082);
INSERT INTO taxaTransf (diasDe, diasAte, valor, taxa) VALUES (21, 30, 0.00, 0.069);
INSERT INTO taxaTransf (diasDe, diasAte, valor, taxa) VALUES (31, 40, 0.00, 0.047);
INSERT INTO taxaTransf (diasDe, diasAte, valor, taxa) VALUES (41, 50, 0.00, 0.017);