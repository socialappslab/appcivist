
CREATE SEQUENCE public.notification_event_signal_user_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;

CREATE TABLE public.notification_event_signal_user
(
  id bigint NOT NULL DEFAULT nextval('notification_event_signal_user_id_seq'::regclass),
  user_user_id bigint,
  notification_event_signal_id bigint,
  read boolean,

  CONSTRAINT pk_notification_event_signal_user PRIMARY KEY (id),
  CONSTRAINT fk_user FOREIGN KEY (user_user_id) REFERENCES public.appcivist_user (user_id) MATCH SIMPLE,
  CONSTRAINT fk_notification_event_signal FOREIGN KEY (notification_event_signal_id) REFERENCES public.notification_event_signal (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);